package de.theis.alexa.helloworld.servlet.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

public class InsuranceRateIntentRequestHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.intentName("insuranceRate"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "200 Euro";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Deine Rate beträgt", speechText)
                .build();
    }
}
