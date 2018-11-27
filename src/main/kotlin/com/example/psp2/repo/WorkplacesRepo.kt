package com.example.psp2.repo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface WorkplacesRepo: JpaRepository<WorkplacesRepo, String>