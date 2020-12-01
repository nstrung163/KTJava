package trungBo;

import java.util.ArrayList;

import trungBean.NhanVienBean;
import trungDao.NhanVienDao;

public class NhanVienBo {
	
	public ArrayList<NhanVienBean> TimKiemNhanVien(String keyword) {
		NhanVienDao nhanVienDao = new NhanVienDao();
		ArrayList<NhanVienBean> dsNhanVienTraVe = nhanVienDao.timKiemNhanVien(keyword);
		return dsNhanVienTraVe;
	}
	public ArrayList<NhanVienBean> getAllNhanVienBo() {
		NhanVienDao nhanVienDao = new NhanVienDao();
		ArrayList<NhanVienBean> dsNhanVienTraVe = nhanVienDao.getAllNhanVien();
		return dsNhanVienTraVe;
	}
}
