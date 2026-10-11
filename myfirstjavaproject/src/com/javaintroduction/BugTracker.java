package com.javaintroduction;

public class BugTracker {
     int bugId;
     String applicationName;
     String bugTitle;
     String severity;
     String priority;
     boolean status;
     String assignedDev;
     String updateAssignedDev;
     public static void main(String[] args) {
		BugTracker bt = new BugTracker();
		bt.bugId = 1;
		bt.applicationName = "WebApplication";
		bt.bugTitle = "Page not found";
		bt.severity = "medium";
		bt.priority = "high";
		bt.status = true;
		bt.assignedDev = "developer";
		bt.getId();
		bt.getApplicationName();
		bt.getPriority();
		bt.getBugTitle();
		bt.getSeverity();
        bt.getStatus();
        bt.updateAssignedDev(2, "Divya");
     }
     
     void getId() {
    	 System.out.println(bugId);
     }
     void getApplicationName() {
    	 System.out.println(applicationName);
     }
     void getBugTitle() {
    	 System.out.println(bugTitle);
     }
     void getSeverity() {
    	 System.out.println(severity);
     }
     void getPriority() {
      	 System.out.println(priority);
     }
     void getStatus() {
      	 System.out.println(status);
     }
     void getAssignedDev() {
    	 System.out.println(assignedDev);
     }
     void updateAssignedDev(int bugId, String name) {
    	 updateAssignedDev=name;
    	 System.out.println(updateAssignedDev+" hlo");
     }
     
     
}
