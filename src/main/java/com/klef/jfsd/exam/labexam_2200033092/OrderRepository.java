package com.klef.jfsd.exam.labexam_2200033092;

import com.klef.jfsd.exam.labexam_2200033092.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {}
