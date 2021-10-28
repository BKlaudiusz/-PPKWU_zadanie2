# -PPKWU_zadanie2

# REST API

### Request

`GET /checkString?stringToCheck={InputString}/`

    example: /checkString?stringToCheck=Aioee12123

### Response

    HTTP/1.1 200 OK
    Date: Thu, 24 Feb 2011 12:36:30 GMT
    Status: 200 OK
    Connection: close
    Content-Type: application/json
    Content-Length: 2

      {
      "lowerChar":4,
      "UpperChar":1,
      "numbers":5,
      "specialMarks":0
      "hasCombination"false
      }
