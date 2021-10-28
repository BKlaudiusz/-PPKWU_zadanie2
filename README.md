# -PPKWU_zadanie2

# REST API

### Request

`GET /checkString?stringToCheck={InputString}/`

    example: /checkString?stringToCheck=Aioee12123

### Response

    HTTP/1.2 200 OK

     analysis{
      "lowerChar":4,
      "UpperChar":1,
      "numbers":5,
      "specialMarks":0
      "hasCombination"false
      }
      
### Errors

` Sending invalid JSON will result in a 400 Bad Request response.`

    HTTP/2 400
    Content-Length: 35
    {"message":"Problems parsing JSON"}
     
