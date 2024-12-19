## Table of Contents
- [Setup Junit](#Setup-JUnit)
- [Debugger](#Debugger)
- [Additional](#Additional)
---

## Setup JUnit

ให้ทำตามในนี้เลย

[Setup Junit5 in IntelliJ](https://www.jetbrains.com/help/idea/junit.html#intellij)
(ในห้องผมอาาจะกดบางอย่างพลาดไปต้องขออภัยด้วยครับ แต่ว่าทำตาม link นี้ก็ชัวร์สุดแล้ว)

หากว่ามี Project อยู่แล้ว และอยากจะเพิ่ม Test ก็สามารถทำได้เลย 
โดย
  1. ต้องดูก่อนว่าสร้างโปรเจคมาด้วยอะไร Gradle, Maven, INtellij build tool
  2. อ่านตามลิงก์ที่ผมให้ไป และต้องเลือกอ่านให้ถูกอันด้วย

---

## Annotation

[JUnit5 assertion Document](https://junit.org/junit5/docs/current/api/org.junit.jupiter.api/org/junit/jupiter/api/package-summary.html)

ผมต้องขอโทษด้วยเรื่องที่ผม อธิบายเรื่องลำดับของ Before After ผิดไป

คือ ความจริงแล้ว หากว่าเราไม่ใส่เลขมันจะเป็นอันที่มาก่อน อันที่มีเลข ไม่ใช่ว่า มันไม่อ่าน 

อย่างเช่น

  AfterAllTest

  AfterAllTest0

  ในกรณีนี้ AfterAllTest จะทำงานก่อน AfterAllTest0

---

## Asserion

[JUnit5 Assertion Document](https://junit.org/junit5/docs/5.0.1/api/org/junit/jupiter/api/Assertions.html)

ผมได้เตรียมไฟล์ไว้ให้ลองเล่น 2 ตัวแล้วนะครับ (ที่ชื่อยาวๆ ลองเล่นได้เลยครับ)

---

## Testing result

[Test Results](https://www.jetbrains.com/help/idea/viewing-and-exploring-test-results.html#sort-test-results)

ในเครื่องหลายๆคนอาจจะมีสีที่แตกต่างไปจากของผมนะครับ ผมไม่แน่ใจว่าทำไมแต่ คาดว่า อาจจะเป็นเพราะ Operator System ครับ 

เครื่องที่ผมใช้อยู่มันเป็น Kali Linux ครับ ตอนที่ผมเปิด Document ใน FireFox ผมก็เห็นว่า Test failed มันเป็นสีเหลืองครับ แต่พแมาเปิดใน Window มันเป็นสีแดงครับ แต่สัญลักษณ์ เหมือนกันครับ

---

## Debugger

ผมและ TA Chin ได้เตรียมให้เล่น 3 ตัวอย่างครับ
[Go to Introduction] (#Find_length)
[Go to Introduction] (#Factorial)
[Go to Introduction] (#Palindrome)
 
---

## Find_length

ตัวนี้ผมไม่ได้เตรียม Junit Test มาให้แต่ว่าผมเตรียม Main มาให้ครับ คือ Main_find_length.java
(จริงๆ linkedlist ที่เตรียมไว้ให้มันก็มีช่องให้เล่นเยอะอยู่ จะเล่นหับอันนั้นแทนก็ได้ครับ เพราะผม ลืมเช็คไปหลายเคสเหมือนกัน)

---

## Factorial

อันนี้ TA Chin ได้เตรียม Test มาให้ครับ สามารถใช้ ตัวนั้นแทน Main ได้เลยครับ

---

## Palindrome

อันนี้อันที่ชื่อ Correct คืออันที่ถูกครับ ที่เหลือคืออันที่ ผิด เลือก version ที่ชอบและลองเล่นได้เลยครับ

---

## Additional

ในสไลด์ จะเห็นได้ว่าจะมีหน้าที่ พูดเรื่อง framework อื่นๆที่เกี่ยวข้องกับ Automation testing อยู่ ซึ่งผมยกมาให้ดู 12 ตัว (บางตัวอาจะใช้ในการทดสอบเว็ป) แต่ว่าในห้องอาจจะไม่มีเวลาให้พูดถึง และอาจารย์ก็เน้นอีกตัวคือ Mockito ชึ่งแนะนำว่าให้ลองไปอ่านเพิ่มเติมดูครับ

ผมเชื่อว่าจะมีบางคนตอนนี้ที่ติด VScode ครับ (ผมเป็นหนึ่งในนั้น และมันก็เป็นเหตุให้ผมไม่คุ้นชินกับ Intellij ตอนอยู่หน้าห้อง) ชึ่งสิ่งที่ท่านเรียนไปวันนี้หลายๆอย่าง VScode ก็มีครับ 

ผมหวังว่าพวกท่านจะนำสิ่งที่ได้รู้ในวันนี้ไปใช้ต่อได้นะครับ 

ขออภัยในความผิดหลาดในวันนี้และขอบคุณที่อยู่ฟังจนจบครับ

และก็ขอขอบคุณอาจารย์ที่ให้ผมได้มีโอกาสในการออกไปฝึกพูดหน้าห้องครับ
