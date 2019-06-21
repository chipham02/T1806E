@extends("layout")

@section("main_content")
    <h1>Danh sách</h1>
    <a href="{{url("sinhvien/create")}}">Tạo mới</a>
    <table class="table">
        <thead>
            <th>ID</th>
            <th>Tên sinh viên</th>
            <th>Giới tính</th>
            <th>Ngày sinh</th>
            <th>Quên quán</th>
            <th>Lớp</th>
            <th>Action</th>
        </thead>

        <tbody>
        @foreach($sinhviens as $sinhvien)
            <tr>
                <td>{{$sinhvien->sinhvien_id}}</td>
                <td>{{$sinhvien->ten}}</td>
                <td>{{$sinhvien->gioitinh}}</td>
                <td>{{$sinhvien->ngaysinh}}</td>
                <td>{{$sinhvien->quequan}}</td>
                <td>{{$sinhvien->lop_id}}</td>
                <td>
                    <a href="{{url("sinhvien/edit?sinhvien_id=".$sinhvien->sinhvien_id)}}">Edit</a>
                    |
                    <a href="{{url("sinhvien/delete/.$sinhvien->sinhvien_id")}}">Delete</a>
                </td>
            </tr>
        @endforeach
        </tbody>
    </table>
    {!! $sinhviens->links("paginator") !!}
@endsection
