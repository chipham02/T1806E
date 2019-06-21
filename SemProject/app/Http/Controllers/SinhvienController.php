<?php

namespace App\Http\Controllers;

use App\Sinhvien;
use Illuminate\Foundation\Bus\DispatchesJobs;
use Illuminate\Routing\Controller as BaseController;
use Illuminate\Foundation\Validation\ValidatesRequests;
use Illuminate\Foundation\Auth\Access\AuthorizesRequests;
use Illuminate\Http;

class SinhvienController extends BaseController
{
    use AuthorizesRequests, DispatchesJobs, ValidatesRequests;

    public function sinhvienCreate(){
        return view("sinhvien_form");
    }

    public function sinhvienValidate(){
        return[
            "ten" => ['required','string','min:10', 'max:255'],
            "gioitinh" => ['required'],
            "ngaysinh" => ['required'],
            "quequan" => ['required','string','min:10', 'max:255'],
            "lop_id" => ['required'],
        ];
    }

    public function sinhvienSave(Http\Request $request){
        $this->validate($request,$this->sinhvienValidate());
        Sinhvien::create(
            [
                "ten"=> $request->get("ten"),
                "gioitinh"=> $request->get("gioitinh"),
                "ngaysinh"=> $request->get("ngaysinh"),
                "quequan"=> $request->get("quequan"),
                "lop_id"=> $request->get("lop_id"),
            ]
        )->save();
        return redirect("sinhvien");
    }

    public function sinhvienEdit(Http\Request $request){
        $sinhvien_id = $request->get("sinhvien_id");
        $sinhvien = Sinhvien::find("sinhvien_id");
        return view("edit_form",compact("sinhvien"));
    }

    public function sinhvienUpdate(Http\Request $request){
        $sinhvien_id = $request->input('sinhvien_id');
        $sinhvien = Sinhvien::where('sinhvien_id',$sinhvien_id)->update([
            "ten"=> $request->get("ten"),
            "gioitinh"=> $request->get("gioitinh"),
            "ngaysinh"=> $request->get("ngaysinh"),
            "quequan"=> $request->get("quequan"),
            "lop_id"=> $request->get("lop_id"),
        ]);

        return redirect("sinhvien");
    }

    public function sinhviens(Http\Request $request){
        $page = $request->get("page")?$request->get("page"):1;
        $limit = $request->get("limit")?$request->get("limit"):10;
        $offset = ($page-1)*$limit;
        $sinhviens = Sinhvien::where("sinhvien_id","<",200)->orderBy("sinhvien_id","ASC")->orderBy("ten","DESC")->paginate(10);
        return view("sinhvien",compact("sinhviens"));
    }

    public function sinhvienDelete(){
        $sinhvien = Sinhvien::find("id");
        $sinhvien->delete();
        return redirect("sinhvien");
    }
}

