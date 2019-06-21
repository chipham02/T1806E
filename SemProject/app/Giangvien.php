<?php

namespace App;
use Illuminate\Database\Eloquent\Model;

class Giangvien extends Model
{
    protected $table='giangvien';

    protected $primaryKey = "giangvien_id";

    protected $fillable = ["magv","tengv","gioitinh","ngaysinh","quequan","bomon"];

    public function monhocs()
    {
        return $this->hasMany('App\Monhoc','giangvien_id','id');
    }
}
