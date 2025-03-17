import java.util.ArrayList;

public class TestHarness {
    public static void main(String[] args){
        Card C_1 = new Card(14, 1);
        Card C_2 = new Card(2, 1);
        Card C_3 = new Card(3,1);
        Card C_4 = new Card(4, 1);
        Card C_5 = new Card(5,1);
        Card C_6 = new Card(6, 1);
        Card C_7 = new Card(7, 1);

        Card twoC_1 = new Card(8, 1);
        Card twoC_2 = new Card(9, 1);
        Card twoC_3 = new Card(10,1);
        Card twoC_4 = new Card(11, 1);
        Card twoC_5 = new Card(12,1);
        Card twoC_6 = new Card(13, 1);

        Card threeC_1 = new Card(14, 2);
        Card threeC_2 = new Card(2, 2);
        Card threeC_3 = new Card(3,2);
        Card threeC_4 = new Card(4, 2);
        Card threeC_5 = new Card(5,2);
        Card threeC_6 = new Card(6, 2);
        Card threeC_7 = new Card(7, 2);

        Card fourC_1 = new Card(8, 2);
        Card fourC_2 = new Card(9, 2);
        Card fourC_3 = new Card(10,2);
        Card fourC_4 = new Card(11, 2);
        Card fourC_5 = new Card(12,2);
        Card fourC_6 = new Card(13, 2);

        Card fiveC_1 = new Card(14, 3);
        Card fiveC_2 = new Card(2, 3);
        Card fiveC_3 = new Card(3,3);
        Card fiveC_4 = new Card(4, 3);
        Card fiveC_5 = new Card(5,3);
        Card fiveC_6 = new Card(6, 3);
        Card fiveC_7 = new Card(7, 3);

        Card sixC_1 = new Card(8, 3);
        Card sixC_2 = new Card(9, 3);
        Card sixC_3 = new Card(10,3);
        Card sixC_4 = new Card(11, 3);
        Card sixC_5 = new Card(12,3);
        Card sixC_6 = new Card(13, 3);

        Card sevenC_1 = new Card(14, 4);
        Card sevenC_2 = new Card(2, 4);
        Card sevenC_3 = new Card(3,4);
        Card sevenC_4 = new Card(4, 4);
        Card sevenC_5 = new Card(5,4);
        Card sevenC_6 = new Card(6, 4);
        Card sevenC_7 = new Card(7, 4);

        Card eightC_1 = new Card(8, 4);
        Card eightC_2 = new Card(9, 4);
        Card eightC_3 = new Card(10,4);
        Card eightC_4 = new Card(11, 4);
        Card eightC_5 = new Card(12,4);
        Card eightC_6 = new Card(13, 4);

        ArrayList<Card> highRiver = new ArrayList<Card>();
        highRiver.add(C_1);//14
        highRiver.add(C_3);//3
        highRiver.add(sevenC_5);//5
        highRiver.add(sixC_4);//11
        highRiver.add(twoC_5);//12
        highRiver.add(eightC_6);//13
        highRiver.add(twoC_2);//9
        ArrayList<Card> pairRiver = new ArrayList<Card>();
        pairRiver.add(C_2);//2
        pairRiver.add(threeC_5);//5
        pairRiver.add(C_1);//14
        pairRiver.add(fiveC_7);//7
        pairRiver.add(fiveC_6);//6
        pairRiver.add(fiveC_5);//5
        pairRiver.add(eightC_6);//13
        ArrayList<Card> twoPairRiver = new ArrayList<Card>();
        twoPairRiver.add(C_4);//4
        twoPairRiver.add(C_5);//5
        twoPairRiver.add(C_3);//3
        twoPairRiver.add(fiveC_4);//4
        twoPairRiver.add(fiveC_3);//3
        twoPairRiver.add(C_1);//14
        twoPairRiver.add(sevenC_6);
        ArrayList<Card> tripsRiver = new ArrayList<Card>();
        tripsRiver.add(C_1);//14
        tripsRiver.add(threeC_1);//14
        tripsRiver.add(fiveC_1);//14
        tripsRiver.add(fiveC_4);//4
        tripsRiver.add(fourC_3);//10
        tripsRiver.add(fourC_1);//8
        tripsRiver.add(sevenC_6);//6
        ArrayList<Card> straightRiver = new ArrayList<Card>();
        straightRiver.add(C_2);//2
        straightRiver.add(threeC_3);//3
        straightRiver.add(fiveC_4);//4
        straightRiver.add(sevenC_5);//5
        straightRiver.add(C_6);//6
        straightRiver.add(C_1);//14
        straightRiver.add(threeC_1);//14
        ArrayList<Card> flushRiver = new ArrayList<Card>();
        flushRiver.add(C_2);//2
        flushRiver.add(twoC_1);//8
        flushRiver.add(C_1);//14
        flushRiver.add(sevenC_5);
        flushRiver.add(twoC_6);
        flushRiver.add(C_5);
        flushRiver.add(threeC_1);
        ArrayList<Card> boatRiver = new ArrayList<Card>();
        boatRiver.add(C_5);//5
        boatRiver.add(threeC_5);
        boatRiver.add(C_7);//7
        boatRiver.add(sevenC_7);
        boatRiver.add(C_1);//14
        boatRiver.add(threeC_1);
        boatRiver.add(fiveC_1);
        ArrayList<Card> quadsRiver = new ArrayList<Card>();
        quadsRiver.add(twoC_3);//
        quadsRiver.add(fourC_3);
        quadsRiver.add(sixC_3);
        quadsRiver.add(eightC_3);
        quadsRiver.add(C_1);
        quadsRiver.add(threeC_1);
        quadsRiver.add(fiveC_1);
        ArrayList<Card> SFriver = new ArrayList<Card>();
        SFriver.add(C_4);
        SFriver.add(C_5);
        SFriver.add(C_6);
        SFriver.add(C_7);
        SFriver.add(twoC_1);//8
        SFriver.add(threeC_1);
        SFriver.add(fiveC_1);
        ArrayList<Card> royalRiver = new ArrayList<Card>();
        royalRiver.add(C_1);
        royalRiver.add(twoC_6);
        royalRiver.add(twoC_5);
        royalRiver.add(twoC_4);
        royalRiver.add(twoC_3);
        royalRiver.add(threeC_1);
        royalRiver.add(fiveC_1);
        ArrayList<Card> wheelStraightRiver = new ArrayList<Card>();
        wheelStraightRiver.add(C_1);
        wheelStraightRiver.add(C_2);
        wheelStraightRiver.add(threeC_3);
        wheelStraightRiver.add(C_4);
        wheelStraightRiver.add(C_5);
        wheelStraightRiver.add(threeC_1);
        wheelStraightRiver.add(fiveC_1);
        ArrayList<Card> wheelStraightFlushRiver = new ArrayList<Card>();
        wheelStraightFlushRiver.add(C_1);
        wheelStraightFlushRiver.add(C_2);
        wheelStraightFlushRiver.add(C_3);
        wheelStraightFlushRiver.add(C_4);
        wheelStraightFlushRiver.add(C_5);
        wheelStraightFlushRiver.add(threeC_1);
        wheelStraightFlushRiver.add(fiveC_1);


        ArrayList<Integer> empty = new ArrayList<Integer>();
        ArrayList<Integer> expectedHighRiverTop = new ArrayList<Integer>();
        expectedHighRiverTop.add(14);
        expectedHighRiverTop.add(13);
        expectedHighRiverTop.add(12);
        expectedHighRiverTop.add(11);
        expectedHighRiverTop.add(9);
        returner expectedHighRiver = new returner(0, empty, expectedHighRiverTop);

        ArrayList<Integer> expectedPairRiverTop = new ArrayList<Integer>();
        ArrayList<Integer> expectedPairRiverHigh = new ArrayList<Integer>();
        expectedPairRiverTop.add(5);
        expectedPairRiverHigh.add(14);
        expectedPairRiverHigh.add(13);
        expectedPairRiverHigh.add(7);
        returner expectedPairRiver = new returner(1, expectedPairRiverTop, expectedPairRiverHigh);

        ArrayList<Integer> expectedTwoPairRiverTop = new ArrayList<Integer>();
        ArrayList<Integer> expectedTwoPairRiverHigh = new ArrayList<Integer>();
        expectedTwoPairRiverTop.add(4);
        expectedTwoPairRiverTop.add(3);
        expectedTwoPairRiverHigh.add(14);
        returner expectedTwoPairRiver = new returner(2, expectedTwoPairRiverTop, expectedTwoPairRiverHigh);

        ArrayList<Integer> expectedTripsRiverTop = new ArrayList<Integer>();
        ArrayList<Integer> expectedTripsRiverHigh = new ArrayList<Integer>();
        expectedTripsRiverTop.add(14);
        expectedTripsRiverHigh.add(10);
        expectedTripsRiverHigh.add(8);
        returner expectedTripsRiver = new returner(3, expectedTripsRiverTop, expectedTripsRiverHigh);

        ArrayList<Integer> expectedStraightRiverTop = new ArrayList<Integer>();
        expectedStraightRiverTop.add(6);
        returner expectedStraightRiver = new returner(4, expectedStraightRiverTop, empty);

        ArrayList<Integer> expectedFlushRiverTop = new ArrayList<Integer>();
        expectedFlushRiverTop.add(14);
        returner expectedFlushRiver = new returner(5, expectedFlushRiverTop, empty);

        ArrayList<Integer> expectedBoatRiverTop = new ArrayList<Integer>();
        expectedBoatRiverTop.add(14);
        expectedBoatRiverTop.add(7);
        returner expectedBoatRiver = new returner(6, expectedBoatRiverTop, empty);

        ArrayList<Integer> expectedQuadsRiverTop = new ArrayList<Integer>();
        ArrayList<Integer> expectedQuadsRiverHigh = new ArrayList<Integer>();
        expectedQuadsRiverTop.add(10);
        expectedQuadsRiverHigh.add(14);
        returner expectedQuadsRiver = new returner(7, expectedQuadsRiverTop, expectedQuadsRiverHigh);

        ArrayList<Integer> expectedStraightFlushRiverTop = new ArrayList<Integer>();
        expectedStraightFlushRiverTop.add(8);
        returner expectedStraightFlushRiver = new returner(8, expectedStraightFlushRiverTop, empty);

        returner expectedRoyalRiver = new returner(9, empty, empty);


        ArrayList<Integer> expectedWheelFlushRiverTop = new ArrayList<Integer>();
        expectedWheelFlushRiverTop.add(5);
        returner expectedWheelFlushRiver = new returner(8, expectedWheelFlushRiverTop, empty);

        ArrayList<Integer> expectedWheelRiverTop = new ArrayList<Integer>();
        expectedWheelRiverTop.add(5);
        returner expectedWheelRiver = new returner(4, expectedWheelRiverTop, empty);


        testPoker(highRiver, expectedHighRiver, "Highcard");
        testPoker(pairRiver, expectedPairRiver, "Pair");
        testPoker(twoPairRiver, expectedTwoPairRiver, "Two Pair");
        testPoker(tripsRiver, expectedTripsRiver, "Trips");
        testPoker(straightRiver, expectedStraightRiver, "Straight");
        testPoker(flushRiver, expectedFlushRiver, "Flush");
        testPoker(boatRiver, expectedBoatRiver, "Boat");
        testPoker(quadsRiver, expectedQuadsRiver, "Quads");
        testPoker(SFriver, expectedStraightFlushRiver, "Straight Flush");
        testPoker(royalRiver, expectedRoyalRiver, "Royal Flush");
        testPoker(wheelStraightFlushRiver, expectedWheelFlushRiver, "Wheel Flush");
        testPoker(wheelStraightRiver, expectedWheelRiver, "Wheel Straight");
    }
    
    public static boolean testPoker(ArrayList<Card> river, returner expected, String name){
        ArrayList<Integer> empty = new ArrayList<Integer>();
        returner information = new returner(0, empty, empty);
        River rivered = new River(river, information);
        //rivered.information.printout();
        if(rivered.information.compare(expected)){
            System.out.println(name + " has sucsessfully passed YAY!!!");
            return true;
        } else {
            System.out.println(name + " has failed");
            return false;
        }
    }

}
