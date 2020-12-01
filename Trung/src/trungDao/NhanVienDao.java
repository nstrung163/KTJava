package trungDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import trungBean.NhanVienBean;

public class NhanVienDao {
	
	DungChung dc = new DungChung();
	
	public ArrayList<NhanVienBean> getAllNhanVien() {
		ArrayList<NhanVienBean> dsNhanVien = new ArrayList<NhanVienBean>();
		String sql = "SELECT * FROM Trung";
		try {
			dc.KetNoi();
			PreparedStatement ps = dc.cn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int maNhanVien = rs.getInt("maNhanVien");
				String hoTen = rs.getString("hoTen");
				Date ngaySinh = rs.getDate("ngaySinh"); 
				int heSoLuong = rs.getInt("heSoLuong");
				String diaChi = rs.getString("diaChi");
				dsNhanVien.add(new NhanVienBean(maNhanVien, hoTen, ngaySinh, heSoLuong, diaChi));
			}
			rs.close();
			dc.cn.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Get all nhân viên thất bại");
		}
		return dsNhanVien;
	}
	public ArrayList<NhanVienBean> timKiemNhanVien(String keyword) {
		ArrayList<NhanVienBean> dsNhanVien = new ArrayList<NhanVienBean>();
		String sql = "select * from Trung where HoTen like N'%"+keyword+"%' or DiaChi like N'%"+keyword+"%'";
		try {
			dc.KetNoi();
			PreparedStatement ps = dc.cn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int maNhanVien = rs.getInt("maNhanVien");
				String hoTen = rs.getString("hoTen");
				Date ngaySinh = rs.getDate("ngaySinh"); 
				int heSoLuong = rs.getInt("heSoLuong");
				String diaChi = rs.getString("diaChi");
				dsNhanVien.add(new NhanVienBean(maNhanVien, hoTen, ngaySinh, heSoLuong, diaChi));
			}
			rs.close();
			dc.cn.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Tìm kiếm nhân viên thành công!");
		}
		return dsNhanVien;
	}
}
