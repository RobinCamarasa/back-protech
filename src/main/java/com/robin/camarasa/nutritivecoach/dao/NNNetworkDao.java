package com.robin.camarasa.nutritivecoach.dao;
import com.robin.camarasa.nutritivecoach.Neural_network.NNNetwork;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NNNetworkDao extends JpaRepository<NNNetwork, Long> {
}