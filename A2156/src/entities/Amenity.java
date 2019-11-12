package entities;

	public class Amenity extends Service {
		private String cost;
		String proType;
		String description;
		String code;

		public Amenity(String code, String proType,String description, String cost) {
			super();
			this.description = description;
			this.code = code;
			this.proType = proType;
			this.cost = cost;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getProType() {
			return proType;
		}

		public void setProType(String proType) {
			this.proType = proType;
		}

		public String getCost() {
			return cost;
		}

		public void setCost(String cost) {
			this.cost = cost;
		}

		@Override
		public double GetTax(double subtotal) {
			
			return 0;
		}


		@Override
		public double ComputeSubTotal(String n, String type) {
			String[] n2 = n.split(",");
			int nUnits = Integer.parseInt(n2[0]);
			double cost = Double.parseDouble(n2[1]);	
				return nUnits*cost;
		}

		@Override
		public double ComputeGrandTotal(double tax, double subtotal) {

			return 0;
		}

	

	

	

}
