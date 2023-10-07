package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary <= 10_000) {
            System.out.println(salary - salary * 0.15);
        }

        if (salary <= 20_000 && salary >= 10_000) {
            System.out.println(salary - salary * 0.18);
        }

        if (salary > 20_000) {
            System.out.println(salary - salary * 0.2);
        }

        if (salary < 0) {
            System.out.println("wrong input!");
        }
    }
}
