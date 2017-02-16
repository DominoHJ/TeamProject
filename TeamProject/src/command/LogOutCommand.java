package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import dto.Dto;

public class LogOutCommand implements Command{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String loginid = request.getParameter("userid");
		Dao dao = new Dao();
		Dto dto = null;
		int loginCheck = 0;
		dao.logout(loginid, loginCheck);
		request.setAttribute("logout", dto);
	}
}
