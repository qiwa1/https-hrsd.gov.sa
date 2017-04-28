// Download the twilio-csharp library from twilio.com/docs/libraries/csharp
using System;
using Twilio;
using Twilio.Rest.Chat.V2.Service;

class Example
{
    static void Main(string[] args)
    {
        // Find your Account SID and Auth Token at twilio.com/console
        const string accountSid = "accountSid";
        const string authToken = "authToken";
        const string serviceSid = "serviceSid";
        const string identity = "identity";
        const string roleSid = "roleSid";

        TwilioClient.Init(accountSid, authToken);

        var user = UserResource.Create(serviceSid, identity, roleSid);

        Console.WriteLine(user.RoleSid);
    }
}
