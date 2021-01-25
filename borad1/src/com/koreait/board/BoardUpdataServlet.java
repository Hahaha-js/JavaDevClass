package com.koreait.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.board.dao.BoardDAO;
import com.koreait.board.model.BoardEntity;

/**
 * Servlet implementation class UpdataBoardServlet
 */
@WebServlet("/update")
public class BoardUpdataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strI_board = request.getParameter("i_board");
		int i_board = Integer.parseInt(strI_board);
		
		BoardEntity param = new BoardEntity();
		param.setI_board(i_board);
		request.setAttribute("update", BoardDAO.delBoard(param));
		
		String jsp = "/WEB-INF/jsp/update.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strI_board = request.getParameter("i_board");
		int i_board = Integer.parseInt(strI_board);
		
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");
		
		BoardEntity param = new BoardEntity();
		param.setTitle(title);
		param.setCtnt(ctnt);
		param.setI_board(i_board);
		
		
		
		response.sendRedirect("/list");
	}

}
