package com.example.psp2.repo

import com.example.psp2.entities.Workplaces.Workplace
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface WorkplacesRepo: JpaRepository<Workplace, String>