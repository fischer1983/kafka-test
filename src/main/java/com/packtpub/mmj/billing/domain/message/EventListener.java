package com.packtpub.mmj.billing.domain.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;

import com.luciano.PessoaFisica;


public class EventListener {

  private static final Logger LOG = LoggerFactory.getLogger(EventListener.class);

  @StreamListener(BillingMessageChannels.BOOKING_ORDER_INPUT)
  public void consumeBookingOrder(PessoaFisica PessoaFisica) {
    LOG.info("Received BookingOrder: {}", PessoaFisica);
  }
}
