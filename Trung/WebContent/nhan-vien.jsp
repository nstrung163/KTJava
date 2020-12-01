<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="trungBean.NhanVienBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quản lý nhân viên</title>
<link rel="stylesheet" href="asset/css/normalize.css"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,300;0,400;0,500;0,900;1,300;1,400;1,500;1,700&display=swap" rel="stylesheet">
<link rel="stylesheet" href="asset/plugins/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="asset/plugins/font-awesome/css/all.min.css">
<link rel="stylesheet" href="asset/css/nhan-vien.css">
</head>
<body>
	<%ArrayList<NhanVienBean> dsNhanVien =(ArrayList<NhanVienBean>) request.getAttribute("dsNhanVien"); 
		int soKetQua = dsNhanVien.size();
	%>
	<div class="container">
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
		  <a class="navbar-brand" href="NhanVienController">Trang chủ</a>
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
		  <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
		    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
		      <li class="nav-item ">
		        <a class="nav-link" href="#">Bán Hàng</a>
		      </li>
		      <li class="nav-item active">
		        <a class="nav-link" href="NhanVienController">Nhân Viên</a>
		      </li>
		    </ul>
		  </div>
		</nav>
	</div>
	<div class="container search-area">
		<form class="form-inline my-2 my-lg-0 form-search" action="<%=request.getContextPath()%>/NhanVienController" method="post">
	      <input name="keyword" class="form-control mr-sm-2" type="search" placeholder="Bạn cần tìm gì...">
	      <!-- <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Tìm kiếm</button> -->
	      <button class="btn btn-outline-success my-2 my-sm-0 btn-search" type="submit"><i class="icon-search fas fa-search"></i></button>
	    </form>
	</div>
	<div class="container">
		<% if(soKetQua != 0) { %>
		<table class="table table-hover">
		  <thead class="bg-thead">
		    <tr>
		      <th scope="col">Mã Nhân Viên</th>
		      <th scope="col">Họ Tên</th>
		      <th scope="col">Ngày Sinh</th>
		      <th scope="col">Hệ số lương</th>
		      <th scope="col">Địa chỉ</th>
		    </tr>
		  </thead>
		  <tbody>
		  <% 
		  for(NhanVienBean nv : dsNhanVien) { 
			 	Date ngaySinhI = nv.getNgaySinh();
				SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
				String ngaySinh = formatter.format(ngaySinhI);
		  %>
		    <tr>
		      <th scope="row"><%=nv.getMaNhanVien() %></th>
		      <td><%=nv.getHoTen() %></td>
		      <td><%=ngaySinh%></td>
		      <td><%=nv.getHeSoLuong() %></td>
		      <td><%=nv.getDiaChi() %></td>
		    </tr>
		    <%} %>
		  </tbody>
		</table>
		<p class="result">Số lượng nhân viên: <%=soKetQua%></p>
		<%} else { %>
			<p class="result">Không tìm thấy nhân viên với từ khóa là: <%=request.getParameter("keyword")%></p>
		<% } %>
	</div>
	<div class="container  bg-light page-footer">
	  <div class="footer-copyright text-center py-3">© 2020 Copyright:
	    <a href="#" class="ten"> Nguyễn Sanh Trưng</a>
	  </div>
	</div>
</body>
</html>