// Open the inbox folder in READ_WRITE mode.
//Retrieves messages from inbox folder (For more details, see the article Receive e-mail messages from a POP3-IMAP server).
//Iterate through the received messages, if one needs to be delete, mark it as deleted by invoking the method setFlag(Flags.Flag.DELETED, true) on the Message object. For example: 

if (message.getSubject().contains("Promo")) {
    message.setFlag(Flags.Flag.DELETED, true);
}
 

//The messages marked DELETED are not actually deleted, until we call the expunge() method on the Folder object, or close the folder with expunge set to true. For example:

boolean expunge = true;
folder.close(expunge);
//or:
folder.expunge();
folder.close(false);