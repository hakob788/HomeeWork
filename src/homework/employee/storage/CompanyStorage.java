package homework.employee.storage;

import homework.employee.model.Company;

public class CompanyStorage {
    private Company[] companies = new Company[10];
    private int size = 0;

    public void add(Company company) {
        if (companies.length == size) {
            extend();
        }
        companies[size++] = company;
    }

    private void extend() {
        Company[] tmp = new Company[companies.length + 10];
        System.arraycopy(companies, 0, tmp, 0, size);
        companies = tmp;
    }

    public Company getCompanyById(String Id) {
        for (int i = 0; i < size; i++) {
            Company company = companies[i];
            if (company.getId().equals(Id)) {
                return company;
            }
        }
        return null;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(companies[i] + " ");
        }
    }
    public int getSize(){
        return size;
    }
}
