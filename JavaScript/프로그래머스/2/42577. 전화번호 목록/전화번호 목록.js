function solution(phone_book) {
  const result = !phone_book
	  .sort()
	  .some((number, idx) => {
	    if (idx === phone_book.length - 1) return false;
	    return phone_book[idx + 1].startsWith(number);
	  });
  return result;
}