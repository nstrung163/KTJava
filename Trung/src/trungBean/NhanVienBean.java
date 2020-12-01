package trungBean;

import java.util.Date;

public class NhanVienBean {
	private int maNhanVien;
	private String hoTen;
	private Date ngaySinh;
	private int heSoLuong;
	private String diaChi;
	/**
	 * @param maNhanVien
	 * @param hoTen
	 * @param ngaySinh
	 * @param heSoLuong
	 * @param diaChi
	 */
	public NhanVienBean(int maNhanVien, String hoTen, Date ngaySinh, int heSoLuong, String diaChi) {
		super();
		this.maNhanVien = maNhanVien;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.heSoLuong = heSoLuong;
		this.diaChi = diaChi;
	}
	public NhanVienBean() {
	}
	/**
	 * @return the maNhanVien
	 */
	public int getMaNhanVien() {
		return maNhanVien;
	}
	/**
	 * @param maNhanVien the maNhanVien to set
	 */
	public void setMaNhanVien(int maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
	/**
	 * @return the hoTen
	 */
	public String getHoTen() {
		return hoTen;
	}
	/**
	 * @param hoTen the hoTen to set
	 */
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	/**
	 * @return the ngaySinh
	 */
	public Date getNgaySinh() {
		return ngaySinh;
	}
	/**
	 * @param ngaySinh the ngaySinh to set
	 */
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	/**
	 * @return the heSoLuong
	 */
	public int getHeSoLuong() {
		return heSoLuong;
	}
	/**
	 * @param heSoLuong the heSoLuong to set
	 */
	public void setHeSoLuong(int heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	/**
	 * @return the diaChi
	 */
	public String getDiaChi() {
		return diaChi;
	}
	/**
	 * @param diaChi the diaChi to set
	 */
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
}
