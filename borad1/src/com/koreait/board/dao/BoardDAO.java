package com.koreait.board.dao;

import java.sql.*;
import java.util.*;

import com.koreait.board.model.BoardEntity;

public class BoardDAO {
	//TODO insBoard 
	public static void insBoard(BoardEntity vo) {

		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = "INSERT INTO t_board" 
				+ " (title, ctnt)" 
				+ " VALUES" 
				+ " (?, ?)";

		try {
			con = DbUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getCtnt());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbUtils.close(con, ps);
		}

	}
	//TODO selBoardList
	public static List<BoardEntity> selBoardList() {
		
		List<BoardEntity> list = new ArrayList<>();
		
		String sql = "SELECT i_board, title, r_dt FROM t_board";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DbUtils.getCon();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				BoardEntity vo = new BoardEntity();
				vo.setI_board(rs.getInt("i_board"));
				vo.setTitle(rs.getString("title"));
				vo.setR_dt(rs.getString("r_dt"));
				list.add(vo);
			}
			return list;
		} catch (Exception e) {
		
			e.printStackTrace();
		} finally {
			DbUtils.close(con, ps, rs);
		}
		
		return null;
	}
	
	public static BoardEntity selBoard(BoardEntity param) {
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM t_board WHERE i_board = ?";
		
		try {
			con = DbUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setInt(1, param.getI_board());
			rs = ps.executeQuery();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbUtils.close(con, ps, rs);
		}
		
		return null;
	}
	
	//TODO delBoard
	
	public static int delBoard(BoardEntity param) {
		
		Connection con = null;
		PreparedStatement ps = null;

		String sql = "DELETE FROM t_board WHERE i_board = ?";
		try {
			con = DbUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setInt(1, param.getI_board());
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.close(con, ps);
		}
		
		return 0;
	}
	
	
	
	
	//TODO updBoard
	public static int updBoard (BoardEntity param) {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		
		String sql = "UPDATE t_board SET ctnt = ?, title = ? WHERE i_board = ?  ";
		try {
			con = DbUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setString(1, param.getCtnt());
			ps.setString(2, param.getTitle());
			ps.setInt(3, param.getI_board());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbUtils.close(con, ps);
		}
		
		
		
		return 0;
	}
}


















