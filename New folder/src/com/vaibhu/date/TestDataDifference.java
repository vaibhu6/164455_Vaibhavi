package com.vaibhu.date;

public class TestDataDifference {

		private int startDate;
		private int endDate;
		private int calculatedDay;
		
		public TestDataDifference(int startDate, int endDate, int calculatedDays, int calculatedDay) {
			super();
			this.startDate = startDate;
			this.endDate = endDate;
			this.calculatedDay = calculatedDay;
		}

		public int getStartDate() {
			return startDate;
		}

		public void setStartDate(int startDate) {
			this.startDate = startDate;
		}

		public int getEndDate() {
			return endDate;
		}

		public void setEndDate(int endDate) {
			this.endDate = endDate;
		}

		public int getCalculatedDay() {
			return calculatedDay;
		}

		public void setCalculatedDay(int calculatedDay) {
			this.calculatedDay = calculatedDay;
		}
		
		
}
