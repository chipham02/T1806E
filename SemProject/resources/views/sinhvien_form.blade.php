@extends("layout")

@section("main_content")

    <form class="form-horizal" method="post" action="{{url("/sinhvien/create")}}">
        @csrf
        <div class="form-group">
            <label>Tên sinh viên</label>
            <input type="text" name="ten" class="form-control" value="{{old("ten")}}">
            @if($errors->has("ten"))
                <p style="color:red"><i>{{$errors->first("ten")}}</i></p>
            @endif
        </div>

        <div class="form-group">
            <label>Giới tính</label>
            <input type="text" name="gioitinh" class="form-control" value="{{old("gioitinh")}}">
            @if($errors->has("gioitinh"))
                <p style="color:red"><i>{{$errors->first("gioitinh")}}</i></p>
            @endif
        </div>

        <div class="form-group">
            <label>Ngày sinh</label>
            <input type="date" name="ngaysinh" class="form-control" value="{{old("ngaysinh")}}">
            @if($errors->has("ngaysinh"))
                <p style="color:red"><i>{{$errors->first("ngaysinh")}}</i></p>
            @endif
        </div>

        <div class="form-group">
            <label>Quê quán</label>
            <input type="text" name="quequan" class="form-control" value="{{old("quequan")}}">
            @if($errors->has("quequan"))
                <p style="color:red"><i>{{$errors->first("quequan")}}</i></p>
            @endif
        </div>

        <div class="form-group">
            <label>Lớp</label>
            <input type="text" name="lop_id" class="form-control" value="{{old("lop_id")}}">
            @if($errors->has("lop_id"))
                <p style="color:red"><i>{{$errors->first("lop_id")}}</i></p>
            @endif
        </div>

        <div class="form-group">
            <button type="submit" class="btn btn-warning">
                <span>Submit</span>
            </button>
        </div>
    </form>

@endsection
