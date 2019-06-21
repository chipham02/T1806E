<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Khoa extends Model
{
    protected $table='khoa';
    public function lops()
    {
        return $this->hasMany('App\Lop','khoa_id','id');
    }
}
