package de.theis.alexa.helloworld.servlet;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.servlet.SkillServlet;
import de.theis.alexa.helloworld.servlet.handlers.*;


public class HelloWorldSkillServlet extends SkillServlet {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new InsuranceRateIntentRequestHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler())
                .build();
    }

    public HelloWorldSkillServlet() {
        super(getSkill());
    }
}
