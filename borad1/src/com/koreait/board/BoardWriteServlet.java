package com.koreait.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.board.dao.BoardDAO;
import com.koreait.board.model.BoardEntity;


@WebServlet("/write")
public class BoardWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    //list 뿌릴때 post 필요없음
	//write는 둘다 필요
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String jsp = "/WEB-INF/jsp/write.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");
		
		System.out.println("title :" + title); //getParameter 의 리턴타입은 스트링!
		System.out.println("ctnt : " + ctnt);
		
		
		BoardEntity vo = new BoardEntity();
		vo.setTitle(title);
		vo.setCtnt(ctnt);
		
		BoardDAO.insBoard(vo);
		
		
		
		response.sendRedirect("/list");
		//doGet(request, response);
		
	}

}
