<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreateTableDiem extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('diem', function (Blueprint $table) {
            $table->increments('diem_id');
            $table->string('madiem',10)->unique();
            $table->integer('diemcc');
            $table->integer('diemtx');
            $table->integer('diemgk');
            $table->integer('diemck');
            $table->integer('diemtong');
            $table->integer('diemrl')->comment('điểm trèn luyện');
            $table->integer('id')->unsigned();


            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('diem');
    }
}
