function printVowels(...characters) {
    let vowelsCount = 0;
    
    for (const char of characters) {
    const lowerChar = char.toLowerCase();
    if (lowerChar === 'a' || lowerChar === 'e' || lowerChar === 'i' || lowerChar === 'o' || lowerChar === 'u') {
    vowelsCount++;
    }
    }
    
    console.log(`Total vowels: ${vowelsCount}`);
      }
      printVowels('j','a','v','a','s','c','r','i','p','t');