$(document).ready(function() {
	/*Check duplicate of tenDn*/
	var resultDuplicate = "";
	$('#tenDn').change(function() {
		var tenDn = $('#tenDn').val();
		var hoTen = $('#hoTen').val();
		var diaChi = $('#diaChi').val();
		var soDienThoai = $('#soDienThoai').val();
		var email = $('#email').val();
		var pass = $('#pass').val();
		$.ajax({
			type: 'POST',
			data: {
					tenDn: tenDn,
					hoTen: hoTen, 
					diaChi: diaChi, 
					soDienThoai: soDienThoai,
					email: email,
					pass: $('#pass').val(),
					},
			url: 'KhachHangController',
			success: function(result) {
				$('#result').html(result);
				resultDuplicate = $('#result').html();
				$("#formDangKy").submit(function(event) {
					if(!Boolean(resultDuplicate)) {
						alert( "Đăng ký thành công!" );
						event.preventDefault();
					} else {
						alert( "Tên đăng nhập đã bị trùng!" );
						event.preventDefault();
					}
				})
			}
		})
	})
	
	/* Hidden and show more items*/
	var max = 10;
	$('ul, li').each(function() {
		$(this).find('li').each(function(index) {
			if (index >= max) {
				$(this).hide();
			}
		})
	})
	$('.an-bot').on('click', function(event) {
		event.preventDefault();
		$('.an-bot').addClass("d-none");
		$('.xem-them').removeClass("d-none");
		$('ul, li').each(function() {
			$(this).find('li').each(function(index) {
				if (index >= max) {
					$(this).hide();
				}
			})
		})
	})
	$('.xem-them').on('click', function(event) {
		event.preventDefault();
		$('.an-bot').removeClass("d-none");
		$('.xem-them').addClass("d-none");
		$('ul, li').each(function() {
			$(this).find('li').each(function(index) {
				$(this).show();
			})
		})
	})
})
$('.carousel').carousel({
  interval: 4000
})
function getFormattedNgayMua(ngayMua) {
	var date = new Date(ngayMua);
	var day = date.getDate();
	var month = date.getMonth() + 1;
	var year = date.getFullYear();
	if (date < 10) { date = '0' + date }
	if (month < 10) { month = '0' + month }
	return day + '/' + month + '/' + year;
}