package br.com.stock_service.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class StockListener {

    @KafkaListener(topics = "estoque-topico", groupId = "estoque-group")
    public void processSales(String mensagem){
        System.out.println("Venda recebida: " + mensagem);
    }

}
