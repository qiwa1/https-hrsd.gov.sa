import com.twilio.twiml.voice.Connect;
import com.twilio.twiml.voice.Conversation;
import com.twilio.twiml.VoiceResponse;
import com.twilio.twiml.TwiMLException;
import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        Conversation conversation = new Conversation.Builder().serviceInstanceSid("ISxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx").statusCallback("https://example.com/yourStatusCallback").statusCallbackEvents(Arrays.asList(Conversation.Event.CALL_INITIATED, Conversation.Event.CALL_IN_PROGRESS, Conversation.Event.CALL_RINGING, Conversation.Event.CALL_COMPLETED)).build();
        Connect connect = new Connect.Builder().conversation(conversation).build();
        VoiceResponse response = new VoiceResponse.Builder().connect(connect).build();

        try {
            System.out.println(response.toXml());
        } catch (TwiMLException e) {
            e.printStackTrace();
        }
    }
}
