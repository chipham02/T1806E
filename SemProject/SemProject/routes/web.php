<?php

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('welcome');
});

Auth::routes();

Route::get("sinhvien/create","SinhvienController@sinhvienCreate");
Route::post("sinhvien/create","SinhvienController@sinhvienSave");
Route::get("sinhvien/edit","SinhvienController@sinhvienEdit");
Route::post("sinhvien/edit","SinhvienController@sinhvienUpdate");
Route::get("sinhvien/delete/{sinhvien_id}","SinhvienController@sinhvienDelete");
Route::get("sinhvien","SinhvienController@sinhviens");

Route::get("lop/create","LopController@lopCreate");
Route::post("lop/create","LopController@lopSave");
Route::get("lop/edit","LopController@lopEdit");
Route::post("lop/edit","LopController@lopUpdate");
Route::get("lop/delete/{lop_id}","LopController@lopDelete");
Route::get("lop","LopController@lops");

Route::get("giangvien/create","GiangvienController@giangvienCreate");
Route::post("giangvien/create","GiangvienController@giangvienSave");
Route::get("giangvien/edit","GiangvienController@giangvienEdit");
Route::post("giangvien/edit","GiangvienController@giangvienUpdate");
Route::get("giangvien/delete/{giangvien_id}","GiangvienController@giangvienDelete");
Route::get("giangvien","GiangvienController@giangviens");

Route::get("monhoc/create","MonhocController@monhocCreate");
Route::post("monhoc/create","MonhocController@monhocSave");
Route::get("monhoc/edit","MonhocController@monhocEdit");
Route::post("monhoc/edit","MonhocController@monhocUpdate");
Route::get("monhoc/delete/{monhoc_id}","MonhocController@monhocDelete");
Route::get("monhoc","MonhocController@monhocs");

