package com.study.testapp;

public class SignupVO { //Dto = VO = value Object
		private String userId;
		private String userPw;
		private String userName;
		private String userGender;
		private String userBirth;
		private String userEmail;
		private String userPhone;
		private String userInterest;
		//private Date regDate;
		
		@Override
		public String toString() {
			return "UserDto [userId=" + userId + ",userPw=" + userPw + 
					", userName=" + userName + ", userGender" + userGender + 
					", userBirth" + userBirth + ", userEmail" + userEmail + 
					", userPhone" + userPhone + 
					", userInterest" + userInterest +"]";
		}
		
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getUserPw() {
			return userPw;
		}
		public void setUserPw(String userPw) {
			this.userPw = userPw;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserGender() {
			return userGender;
		}
		public void setUserGender(String userGender) {
			this.userGender = userGender;
		}
		public String getUserBirth() {
			return userBirth;
		}
		public void setUserBirth(String userBirth) {
			this.userBirth = userBirth;
		}
		public String getUserEmail() {
			return userEmail;
		}
		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}
		public String getUserPhone() {
			return userPhone;
		}
		public void setUserPhone(String userPhone) {
			this.userPhone = userPhone;
		}
		public String getUserInterest() {
			return userInterest;
		}
		public void setUserInterest(String userInterest) {
			this.userInterest = userInterest;
		}

    
}