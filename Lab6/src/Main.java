
/*
    Using streams:
        1. print divisions (all, with repetition)
        2. Count number of employees in “Risk Department” (use filter with custom predicator)
        3. Print average and sum salary
        4. Group (to map container) employees by division
 */

public class Main{
    public static void main(String[] args) {
        Employee a = new Employee();
        a.setId(1);
        a.setSalary(1000);
        a.setDivision("Risk Department");

        Employee b = new Employee();
        b.setId(2);
        b.setSalary(120.5);
        b.setDivision("Scoring Department");

        Employee c = new Employee();
        c.setId(3);
        c.setSalary(450);
        c.setDivision("Credit Department");

        Employee d = new Employee();
        d.setId(4);
        d.setSalary(803.3);
        d.setDivision("Risk Department");

        Employee e = new Employee();
        e.setId(5);
        e.setSalary(1245.5);
        e.setDivision("Scoring Department");

        Employee f = new Employee();
        f.setId(6);
        f.setSalary(930.3);
        f.setDivision("Credit Department");

        Employee g = new Employee();
        g.setId(7);
        g.setSalary(1000);
        g.setDivision("Risk Department");

        Employee h = new Employee();
        h.setId(8);
        h.setSalary(450);
        h.setDivision("Scoring Department");

        Employee i = new Employee();
        i.setId(9);
        i.setSalary(345.2);
        i.setDivision("Credit Department");

        Employee j = new Employee();
        j.setId(10);
        j.setSalary(2100.2);
        j.setDivision("Risk Department");

        Employee l = new Employee();
        l.setId(11);
        l.setSalary(1500);
        l.setDivision("Scoring Department");

        Employee m = new Employee();
        m.setId(12);
        m.setSalary(950);
        m.setDivision("Scoring Department");

        Employee n = new Employee();
        n.setId(13);
        n.setSalary(1800);
        n.setDivision("Scoring Department");

        Employee ñ = new Employee();
        ñ.setId(14);
        ñ.setSalary(1200);
        ñ.setDivision("Scoring Department");

        Employee p = new Employee();
        p.setId(15);
        p.setSalary(1010);
        p.setDivision("Scoring Department");


        Manager rm = new Manager("Risk Manager");
        rm.writeOnList(a);
        rm.writeOnList(b);
        rm.writeOnList(c);
        rm.writeOnList(d);
        rm.writeOnList(e);
        rm.writeOnList(f);
        rm.writeOnList(g);
        rm.writeOnList(h);
        rm.writeOnList(i);
        rm.writeOnList(l);
        rm.writeOnList(m);
        rm.writeOnList(n);
        rm.writeOnList(ñ);
        rm.writeOnList(p);
        rm.printDivisions();
        System.out.println("People at Risk Department: "+rm.countRisk());
        rm.printSalaryStuff();
        rm.Group();

        Manager sm = new Manager("Scoring Manager");
        sm.writeOnList(a);
        sm.writeOnList(b);
        sm.writeOnList(c);
        sm.writeOnList(d);
        sm.writeOnList(e);
        sm.writeOnList(f);
        sm.writeOnList(g);
        sm.writeOnList(h);
        sm.writeOnList(i);
        sm.writeOnList(l);
        sm.writeOnList(m);
        sm.writeOnList(n);
        sm.writeOnList(ñ);
        sm.writeOnList(p);
        sm.printDivisions();
        System.out.println("People at Scoring Department: "+sm.countScoring());
        sm.printSalaryStuff();
        sm.Group();

    }
}
//Romen Adama Caetano Ramírez