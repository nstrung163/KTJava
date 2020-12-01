package trungController;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import trungBean.NhanVienBean;
import trungBo.NhanVienBo;
import trungDao.NhanVienDao;

/**
 * Servlet implementation class NhanVienController
 */
@WebServlet("/NhanVienController")
public class NhanVienController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NhanVienController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String keyword = request.getParameter("keyword");
		if(keyword != null) {
			TimKiemNhanVien(request, response);
		} else {
			hienThiNhanVien(request, response);
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	private void hienThiNhanVien(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NhanVienBo nhanVienBo = new NhanVienBo();
		ArrayList<NhanVienBean> dsNhanVien = nhanVienBo.getAllNhanVienBo();
		request.setAttribute("dsNhanVien", dsNhanVien);
		request.getRequestDispatcher("nhan-vien.jsp").forward(request, response);
	}

	private void TimKiemNhanVien(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NhanVienBo nhanVienBo = new NhanVienBo();
		ArrayList<NhanVienBean> dsNhanVien = new ArrayList<NhanVienBean>();
		String keyword = request.getParameter("keyword");
		if(keyword != null) {
			dsNhanVien = nhanVienBo.TimKiemNhanVien(keyword);
		}
		request.setAttribute("dsNhanVien", dsNhanVien);
		request.getRequestDispatcher("nhan-vien.jsp").forward(request, response);
	}	
}
