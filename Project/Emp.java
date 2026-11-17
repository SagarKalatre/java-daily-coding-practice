package Project;

import java.util.List;

class Emp {
    public static void main(String[] args) {
    }

    public List<Laptop> laptopinfo(double price) {
        Session session = LaptopDAOIMP.getSession();
        Criteria criteria = session.createCriteria(Laptop.class);
        Criterion pCond = Restrictions.gt("laptop_price", price);
        Criterion dCond = Restrictions.eq("laptop_princ", price);
        criterion fCond = Restrictions.and(pCond, dCond);
        criteria.add(fCond);

        List<Laptop> laptop_list = criteria.list();
        session.close();
        return laptop_list;
    }

    public List<Laptop> laptopinfo1(double price) {
        Session session = LaptopDAOIMP.getSession();
        Criteria criteria = session.createCriteria(Laptop.class);
        Criterion priceCondition = Restrictions.gt("laptop_price", price);
        Criterion departmentCondition = Restrictions.eq("department", "IT");
        Criterion finalCondition = Restrictions.and(priceCondition, departmentCondition);
        criteria.add(finalCondition);

        List<Laptop> laptop_list = criteria.list();
        session.close();
        return laptop_list;
    }
}