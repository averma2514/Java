package factoryclass;

public class GetPlanFactory {
    public Plan getPlan(String str) {
        
        if (str == null) {
            return null;
        }else if (str.equalsIgnoreCase("domestricplan")) {
            return new DomesticPlan();
        }else if (str.equalsIgnoreCase("commercialplan")) {
            return new CommercialPlan();
        }else if (str.equalsIgnoreCase("Institutionalplan")) {
            return new InstitutionalPlan();
        }else{
            return null;
        }
    }
}
