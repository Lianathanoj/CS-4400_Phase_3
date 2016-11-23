package controller;

import javafx.fxml.FXML;

public class AdminController extends Controller {
	
	// For admin main screen
	@FXML
	public void handleViewApplicationsPressed() {
		showScreen("../view/AdminAppScreen.fxml", "View Applications");
	}
	
	@FXML
	public void handleViewPopularProjectPressed() {
		showScreen("../view/AdminPopularProjectReport.fxml", "Popular Projects");
	}
	
	@FXML
	public void handleViewApplicationReportPressed() {
		showScreen("../view/AdminPopularProjectReport.fxml", "Application Report");
	}
	
	@FXML
	public void handleAddProjectPressed() {
		
	}
	
	@FXML
	public void handleAddCoursePressed() {
		
	}
	
	// For view applications, maybe split into separate controller later
	@FXML
	public void handleBackPressed() {
		showScreen("../view/AdminMainScreen.fxml", "Main Screen");
	}
	
	@FXML
	public void handleAcceptPressed() {
		
	}
	
	@FXML
	public void handleRejectPressed() {
		
	}
	
	
	
	@FXML
    public void handleCancelPressed() {
        showScreen("../view/LoginScreen.fxml", "Login");
    }
}
