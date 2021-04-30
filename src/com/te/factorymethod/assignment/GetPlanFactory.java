package com.te.factorymethod.assignment;

public class GetPlanFactory {
	
	public Plan getPlan(String planType)
	{
				if(planType.equalsIgnoreCase("Domestic"))
		        {
			return new DomesticPlan();
		         }
		
				if(planType.equalsIgnoreCase("Commerical"))
				{
					return new CommercialPlan();
				}
				if(planType.equalsIgnoreCase("Institution"))
				{
					return new InstitutionalPlan();
				}
				
				return null;
				
	}

}