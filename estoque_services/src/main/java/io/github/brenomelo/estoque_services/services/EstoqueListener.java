package io.github.brenomelo.estoque_services.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * A escolha entre @Service ou @Component é puramente arquitetural, dado que o service importa também o component
 * @Component - classe atua apenas como um ponto de entrada técnico (apenas escutar o Kafka)
 * @Service - Vai executar regra de negócio
 */

@Service
public class EstoqueListener {

    @KafkaListener(topics = "estoque-topico", groupId = "estoque-grupo")
    public void processarVenda(String mensagem){
        // Inserir regra de negocio
        System.out.println("Venda recebida: " + mensagem);
    }

}
