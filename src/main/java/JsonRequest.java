//package homeworks.hw2;
//
//public class JsonRequest {
//    public void StringRequest() {
//        String jsonReq = "[{\"фамилия\":\"Иванова\",\"оценка\":\"5\",\"предмет\":\"математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
//        StringBuilder jsonFull = new StringBuilder();
//        String jsonReq1 = jsonReq.substring(1,jsonReq.length()-2);
//        String[] jsonArrays = jsonReq1.split("},");
//        for (String jsonArray : jsonArrays ) {
//            String jsonsArray = jsonArray.substring(1);
//            String[] onePersons = jsonsArray.split(",");
//            for (String onePerson : onePersons ) {
//                String[] oneParametrs = onePerson.split(":");
//                for (String oneParametr : oneParametrs ) {
//                    String onesParametr = oneParametr.substring(1,oneParametr.length()-1);
//                    jsonFull.append(onesParametr+ ",");
//                }
//            }
//        }
//        String result = jsonFull.toString();
//        String[] jsonResult = result.split(",");
//        for (int i = 1; i <=18 ; i++) {
//            System.out.println("Студент "+ jsonResult[i] + " получил " + jsonResult[i+2]+" по предмету " + jsonResult[i+4]);
//            i=i+5;
//        }
//    }
//}