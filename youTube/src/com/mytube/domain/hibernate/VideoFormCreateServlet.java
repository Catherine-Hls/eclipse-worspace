package com.mytube.domain.hibernate;


import java.io.IOException;

import java.util.HashMap;

import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VideoFormCreateServlet
 */
@WebServlet("/video-create")
public class VideoFormCreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VideoFormCreateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("video-create.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String urlvideo = request.getParameter("urlvideo");
		String urlminiature = request.getParameter("urlminiatuture");
		String duration = request.getParameter("duration");
		
		Map<String, String> validationErrors = new HashMap<>();
		if (username.isEmpty()) {
			validationErrors.put("Username", "Username field can't be empty");
		} 
		if (title.isEmpty()) {
			validationErrors.put("Title", "Title field can't be empty");
		
		} 
		if (description.isEmpty()) {
			validationErrors.put("Description", "Description field can't be empty");
		
		} 
		if (urlminiature.isEmpty()) {
			validationErrors.put("URL of the thumbnail", "Description field can't be empty");
		
		} 
		if (urlvideo.isEmpty()) {
			validationErrors.put("URL of the video", "Description field can't be empty");
		
		} 
		if (urlvideo.isEmpty()) {
			validationErrors.put("Duration", "Duration field can't be empty");
			
			} 
		if (title.length() > 100) {
			validationErrors.put("Title", "The title can't exceed 100 characters");
		
		}  
		if (description.length() > 4000) {
			validationErrors.put("Description", "The description can't exceed 4000 characters");
		} 
		
		if ((! duration.isEmpty()) && (Integer.parseInt(duration) > 86400)) {
			validationErrors.put("Duration", "The video duration can't exceed 24h");
		}
		
		if (! validationErrors.isEmpty()) {
			request.setAttribute("username", username);
			request.setAttribute("title", title);
			request.setAttribute("description", description);
			request.setAttribute("urlvideo", urlvideo);
			request.setAttribute("urlminiature", urlminiature);
			request.setAttribute("duration", duration);
			request.setAttribute("validationErrors", validationErrors);
			request.getRequestDispatcher("video-create.jsp").forward(request, response);	
	
		} else if 
			(validationErrors.isEmpty()) {
		
				Video newVideo = new Video();
				newVideo.setDescription(description);
				newVideo.setDuration(Integer.parseInt(duration));
				newVideo.setTitle(title);
				newVideo.setUrlminiature(urlminiature);
				newVideo.setUrlvideo(urlvideo);
			
				UserRepository userRepository = new UserRepository();
				User userByUsername = userRepository.findUserIdByUsername(username);
			
				Long userId = userByUsername.getId();
				
				newVideo.setId(userId);
			
				VideoRepository videoRepository = new VideoRepository();
				videoRepository.add(newVideo);
			
		}
		
		
		
		
		
		
	}

}

