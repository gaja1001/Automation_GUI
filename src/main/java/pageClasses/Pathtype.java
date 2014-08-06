package pageClasses;

public enum Pathtype {
	xpath{
		public String toString(){
		return "xpath";	
		}
	},
	id{
		public String toString(){
			return "id";	
		}
	},	
	css{
			public String toString(){
				return "css";	
			}
	},
	name{
		public String toString(){
			return "name";	
		}
	}
}

