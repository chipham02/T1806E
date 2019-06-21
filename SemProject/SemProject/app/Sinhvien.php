<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Sinhvien extends Model{
    protected $table = "sinhvien";

    protected $primaryKey = "sinhvien_id";

    protected $fillable = ["masv","ten","gioitinh","ngaysinh","quequan","lop_id"];

    public function diems()
    {
        return $this->hasMany('App\Diem','sinhvien_id','id');
    }
    public function lops()
    {
        return $this->belongsTo('App\Lop','lop_id','id');
    }
}
