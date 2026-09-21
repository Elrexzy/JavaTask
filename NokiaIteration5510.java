import java.util.Scanner;
public class nokia5510 {
   public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean menu = true;
        
        do {
            String mainMenu = ("""
                ==============================================
                              WELCOME TO NOKIA
                ==============================================
                Press [Menu] and Select an [Option]

                1  Phone book
                2  Messages
                3  Chat
                4  Call register
                5  Tones
                6  Settings
                7  Call divert
                8  Music
                9  Games
                10 Calculator
                11 Reminders
                12 Clock
                13 Profiles
                14 Services
                15 SIM services
                0 cancel
                ==============================================
                """);

        System.out.println(mainMenu);
        int menuChoice = input.nextInt();

        switch (menuChoice) {
            case 1 -> {
            	boolean inPhoneBook = true;
	          	do {
               	    System.out.println("Phone book");
                    String phoneBook = ("""
                        
                        Press [Menu] and Select an [Option]

                                1. Search
                                2. Service Nos. 1
                                3. Add name
                                4. Erase
                                5. Edit
                                6. Copy
                                7. Assign tone
                                8. Send b'card
                                9. Options
                                10. Speed dials
                                11. Voice tags
                                0. Back to main menu
                        """);

                System.out.println(phoneBook);
                int phoneBookChoice = input.nextInt();

                switch (phoneBookChoice) {
                    case 1 -> System.out.println("Search");
                    case 2 -> System.out.println("Service Nos. 1");
                    case 3 -> System.out.println("Add name");
                    case 4 -> System.out.println("Erase");
                    case 5 -> System.out.println("Edit");
                    case 6 -> System.out.println("Copy");
                    case 7 -> System.out.println("Assign tone");
                    case 8 -> System.out.println("Send b'card");
                    case 9 -> {
                                boolean inOptions = true;
                                do {
                                    System.out.println("""
                                ============================================
                                          Select an [Option]
                                ============================================
                                1. Memory in use
                                2. Type of view
                                3. Memory status
                                0. back
                                """);

                        int options = input.nextInt();
                        switch (options) {
                            case 1 -> System.out.println("Memory in use");
                            case 2 -> System.out.println("Type of view");
                            case 3 -> System.out.println("Memory status");
                            case 0 -> inOptions = false;
                            default -> System.out.println("Invalid option");
                        }
                    } while(inOptions);
                }
                    case 10 -> System.out.println("Speed dials");
                    case 11 -> System.out.println("Voice tags");
                    case 0 -> inPhoneBook = false;
                    default -> System.out.println("Invalid Phone Book option");
                }
            } while (inPhoneBook);
         }
            case 2 -> {
                  boolean inMessages = true;
                  do {
                      System.out.println("Messages");
                      String messages = ("""
                        ============================================
                                      MESSAGES
                        ============================================
                        Press [Menu] and Select an [Option]

                                1. Write messages
                                2. Inbox
                                3. Outbox
                                4. Picture messages
                                5. Templates
                                6. Smileys
                                7. Message settings
                                8. Info service
                                9. Voice mailbox number
                                10. Service command editor
                                0. Back to main menu
                        """);

                System.out.println(messages);
                int messageChoice = input.nextInt();

                switch (messageChoice) {
                    case 1 -> System.out.println("Write messages");
                    case 2 -> System.out.println("Inbox");
                    case 3 -> System.out.println("Outbox");
                    case 4 -> System.out.println("Picture messages");
                    case 5 -> System.out.println("Templates");
                    case 6 -> System.out.println("Smileys");
                    case 7 -> {
                                boolean inMessageSettings = true;
                                do {
                                    System.out.println("""
                                ============================================
                                      Select [Message settings]
                                ============================================
                                1. Set 1
                                2. Common
                                0. Back
                                """);
                                
                        int messageSettings = input.nextInt();

                        switch (messageSettings) {
                            case 1 -> {
                                boolean inSet1 = true;
                                do {
                                    System.out.println("""
                                        ============================================
                                                   Set 1 [select an option]
                                        ============================================
                                        1. Message centre number
                                        2. Messages sent as
                                        3. Message validity
                                        0. Back
                                        """);

                                int set1Choice = input.nextInt();

                                switch (set1Choice) {
                                    case 1 -> System.out.println("Message centre number");
                                    case 2 -> System.out.println("Messages sent as");
                                    case 3 -> System.out.println("Message validity");
                                    case 0 -> inSet1 = false;
                                    default -> System.out.println("Invalid option");
                                }
                            } while (inSet1);
                          }
                            case 2 -> {
                                boolean inCommon = true;
                                do {
                                    System.out.println("""
                                        ============================================
                                                   Common [select an option]
                                        ============================================
                                        1. Delivery reports
                                        2. Reply via same centre
                                        3. Character support
                                        0. Back
                                        """);

                                int commonChoice = input.nextInt();

                                switch (commonChoice) {
                                    case 1 -> System.out.println("Delivery reports");
                                    case 2 -> System.out.println("Reply via same centre");
                                    case 3 -> System.out.println("Character support");
                                    case 0 -> inCommon = false;
                                    default -> System.out.println("Invalid option");
                                }
                            } while (inCommon);
                          }
                          
                            case 0 -> inMessageSettings = false;
                            default -> System.out.println("Invalid Message Settings option");
                        }
                    } while (inMessageSettings);
                  }
                  
                    case 8 -> System.out.println("Info service");
                    case 9 -> System.out.println("Voice mailbox number");
                    case 10 -> System.out.println("Service command editor");
                    case 0 -> inMessages = false;
                    default -> System.out.println("Invalid Messages option");
                }
            } while (inMessages);
          }        

            case 3 -> System.out.println("Chat");
            
            case 4 -> {
                boolean inCallRegister = true;
                do {
                    System.out.println("Call register");
                    String callRegister = ("""
        =====================================================
               Select call [Options]
        =====================================================
        1. Missed calls
        2. Received calls
        3. Dialled numbers
        4. Erase recent call lists
        5. Show call duration
        6. Show call costs
        7. Call cost settings
        8. Prepaid credit
        9. Back to main menu
        """);
                System.out.println(callRegister);
                int callOptions = input.nextInt();
                     switch (callOptions) {
                        case 1 -> System.out.println("Missed calls");
                        case 2 -> System.out.println("Received calls");
                        case 3 -> System.out.println("Dialed numbers");
                        case 4 -> System.out.println("Erase recent call lists");
                        case 5 -> {
                            boolean inShowCallDuration = true;
                            do {
                                System.out.println("""
                               ============================================
                                      Show call duration [select]
                                ============================================
                                1. Last call duration
                                2. All calls’ duration
                                3. Received calls’ duration
                                4. Dialled calls’ durationSet 
                                5. Clear timers
                                0. Back
                                """);
                                
                                 int showCallDuration = input.nextInt();
                                 
                                switch (showCallDuration) {
                                  case 1 -> System.out.println("Last call duration");
                                  case 2 -> System.out.println("All calls’ duration");
                                  case 3 -> System.out.println("Received calls’ duration");
                                  case 4 -> System.out.println("Dialled calls’ duration");
                                  case 5 -> System.out.println("Clear timers");
                                  case 0 -> inShowCallDuration = false;
                                  default -> System.out.println("Invalid option");
                                  
                                 }
                              } while (inShowCallDuration);
                            }
                                  case 6 -> {
                                      boolean showCallCost = true;
                                      do {
                                          System.out.println("""
                                ============================================
                                      Show call cost [select]
                                ============================================
                                1. Last call cost
                                2. All calls’ cost
                                3. Clear counters
                                0. Back
                                """);
                                
                                 int callCost = input.nextInt();
                                 
                                switch (callCost) {
                                  case 1 -> System.out.println("Last call cost");
                                  case 2 -> System.out.println("All calls’ cost");
                                  case 3 -> System.out.println("Clear counters");
                                  case 0 -> showCallCost = false;
                                  default -> System.out.println("Invalid option");
                              }
                           } while (showCallCost);
                          }
                                  case 7 -> { 
                                      boolean inCallCostSettings = true;
                                      do {
                                          System.out.println("""
                                ============================================
                                      Call cost settings [select]
                                ============================================
                                1. Call cost limit
                                2. Show costs in
                                0. Back
                                """);
                                
                                 int callCostSettings = input.nextInt();
                                 
                                switch (callCostSettings) {
                                  case 1 -> System.out.println("Call cost limit");
                                  case 2 -> System.out.println("Show cost in");
                                  case 0 -> inCallCostSettings = false;
                                  default -> System.out.println("Invalid option");
                              }
                            } while(inCallCostSettings);
                          }
                                 
                                  case 8 -> System.out.println("Prepaid credit");
                                  case 0 -> inCallRegister = false;
                                  default -> System.out.println("Invalid option");
                                }
                            } while(inCallRegister);
                          }
                            
               case 5 -> {
                    boolean inTones = true;
                    do {
                        System.out.println("Tones");
                        String tones = ("""
                        =====================================================
                                      [Options]
                        =====================================================
                              1. Ringing tone
                              2. Ringing volume
                              3. Incoming call alert
                              4. Message alert tone
                              5. Keypad tones
                              6. Warning tones
                              7. Vibrating alert
                              8. Screen saver
                              0. Back to main menu
                              """);
                                    System.out.println(tones);
                                    int toneChoices = input.nextInt();
                                    
                                     switch (toneChoices) {
                                        case 1 -> System.out.println("Ringing tone");
                                        case 2 -> System.out.println("Ringing volume");
                                        case 3 -> System.out.println("Incoming call alert");
                                        case 4 -> System.out.println("Message alert tone");
                                        case 5 -> System.out.println("Keypad tones");
                                        case 6 -> System.out.println("Warning tones");
                                        case 7 -> System.out.println("Vibrating alert");
                                        case 8 -> System.out.println("Screen saver");
                                        case 0 -> inTones = false;
                                        default -> System.out.println("Invalid option");
                               }
                              } while(inTones);
                            }
                            
                  case 6 -> {
                      boolean inSettings = true;
                      do {
                          System.out.println(""" 
                              =====================================================              
                                            Settings select an [option]
                              =====================================================
                              1. Call settings
                              2. Phone settings
                              3. Security settings
                              4. Restore factory settings
                              0. Back to main menu
                                            """);
                                            
                                        int settings = input.nextInt();
                                        switch (settings) {
                                            case 1 -> {
                                                boolean inCallSettings = true;
                                                do {
                                                    System.out.println("""
                            ======================================================
                                          Call settings select an [option]
                            ======================================================
                            1. Automatic redial
                            2. Speed dialling
                            3. Call waiting options
                            4. Own number sending
                            5. Phone line in use
                            6. Automatic answer
                            0. Back
                            """);
                            
                                       int callSettings = input.nextInt();
    
                              switch (callSettings) {
                                    case 1 -> System.out.println("Automatic redial");
                                    case 2 -> System.out.println("Speed dialling");
                                    case 3 -> System.out.println("Call waiting options");
                                    case 4 -> System.out.println("Own number sending");
                                    case 5 -> System.out.println("Phone line in use");
                                    case 6 -> System.out.println("Automatic answer");
                                    case 0 -> inCallSettings = false;
                                    default -> System.out.println("Invalid option");
    
                                  }
                                } while(inCallSettings);
                              }
                                          case 2 -> {
                                                boolean inPhoneSettings = true;
                                                do {
                                                    System.out.println("""
                          ===============================================================
                                          Phone settings select an [option]
                          ===============================================================
                            1. Language
                            2. Cell info display
                            3. Welcome note
                            4. Network selection
                            5. Confirm SIM service actions
                            0. Back
                            """);
                                      int phoneSettings = input.nextInt();
                                      
                              switch (phoneSettings) {
                                    case 1 -> System.out.println("Language");
                                    case 2 -> System.out.println("Cell info display");
                                    case 3 -> System.out.println("Welcome note");
                                    case 4 -> System.out.println("Network selection");
                                    case 5 -> System.out.println("Confirm SIM service actions");
                                    case 0 -> inPhoneSettings = false;
                                    default -> System.out.println("Invalid option");
                                }
                              } while(inPhoneSettings);
                            }
    
                                          case 3 -> {
                                                boolean inSecuritySettings = true;
                                                do {
                                                    System.out.println("""
                          =====================================================================
                                          Security settings select an [option]
                          =====================================================================
                            1. PIN code request
                            2. Call barring service
                            3. Fixed dialling
                            4. Closed user group
                            5. Security level
                            6. Change access codes
                            0. Back
                            """);
                            
                                      int securitySettings = input.nextInt();
                                      
                              switch (securitySettings) {
                                    case 1 -> System.out.println("PIN code request");
                                    case 2 -> System.out.println("Call barring service");
                                    case 3 -> System.out.println("Fixed dialling");
                                    case 4 -> System.out.println("Closed user group");
                                    case 5 -> System.out.println("Security level");
                                    case 6 -> System.out.println("Change access codes");
                                    case 0 -> inSecuritySettings = false;
                                    default -> System.out.println("Invalid option");
    
                              }
                            } while (inSecuritySettings);
                          }
    
                                          case 4 -> System.out.println("Restore factory settings");
                                          case 0 -> inSettings = false;
                                          default -> System.out.println("Invalid option");
                                
                                }
                              } while( inSettings);
                            }
    
                                 case 7 -> System.out.println("Call divert");
                                 
                                 case 8 -> {
                                      boolean inMusic = true;
                                      do {
                                          System.out.println("Music");
                                          String music = ("""
                            ==============================================
                                           Music [Options]
                            ==============================================
                              1. Music player
                              2. Radio
                              3. Recorder
                              4. Track list
                              0. Back to main menu
                                  """);
                                  
                                        System.out.println(music);
                                        int musicOption = input.nextInt();
                                        
                            switch(musicOption) {
                                case 1 -> System.out.println("Music player");
                                case 2 -> System.out.println("Radio");
                                case 3 -> System.out.println("Recorder");
                                case 4 -> System.out.println("Track list");
                                case 0 -> inMusic = false;
                                default -> System.out.println("Invalid option");   
                      }
                    } while(inMusic);
                  }
                    case 9 -> System.out.println("Games");  
                    case 10 -> System.out.println("Calculator"); 
                    case 11 -> System.out.println("Reminders");  
                    case 12 -> {
                        boolean inClock = true;
                        do {
                            System.out.println("Clock");
                            System.out.println("""
                              Clock [options]
                =================================================
                1. Alarm clock
                2. Clock settings
                3. Date setting
                4. Stopwatch
                5. Countdown timer
                6. Auto update of date and time
                0. Back to main menu
                """);
                int clockOptions = input.nextInt();
                
                switch (clockOptions) {
                    case 1 -> System.out.println("Alarm clock");
                    case 2 -> System.out.println("Clock settings");
                    case 3 -> System.out.println("Date setting");
                    case 4 -> System.out.println("Stopwatch");
                    case 5 -> System.out.println("Countdown timer");
                    case 6 -> System.out.println("Auto update of date and time");
                    
                    case 0 -> inClock = false;
                    default -> System.out.println("Invalid option");
                    
              }
           } while(inClock);
        }
                   
                    case 13 -> System.out.println("Profiles");
                    case 14 -> System.out.println("Services");
                    case 15 -> System.out.println("SIM services");
                    case 0 -> {
                    System.out.println("...");
                    menu = false;
                }
                default -> System.out.println("Invalid option");
              
              }                  
            } while(menu);
  }
}
