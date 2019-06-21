@extends("layout")

@section("main_content")
    <form method="post" action="{{url("sinhvien/edit")}}">
        @csrf
        <input type="hidden" name="sinhvien_id" value="{{$sinhvien->sinhvien_id}}">
        <div class="form-group">
            <label>Tên sinh viên</label>
            <input type="text" name="ten" value="{{$sinhvien->ten}}" class="form-control">
        </div>
        <div class="form-group">
            <label>Giới tính</label>
            <input type="text" name="gioitinh" value="{{$sinhvien->gioitinh}}" class="form-control">
        </div>
        <div class="form-group">
            <label>Ngày sinh</label>
            <input type="date" name="ngaysinh" value="{{$sinhvien->ngaysinh}}" class="form-control">
        </div>
        <div class="form-group">
            <label>Quê quán</label>
            <input type="text" name="quequan" value="{{$sinhvien->quequan}}" class="form-control">
        </div>
        <div class="form-group">
            <label>Lớp</label>
            <input type="text" name="lop_id" value="{{$sinhvien->lop_id}}" class="form-control">
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-outline-warning">
                <span>Submit</span>
            </button>
        </div>
    </form>
@endsection
