package com.embarkx.firstapp.company;

import java.util.List;

public interface CompanyService {
    List<Company> findAll();

    void createCompany(Company company);

    boolean updateCompany(Long id, Company company);

    boolean deleteCompany(Long id);

    Company findById(Long id);
}
