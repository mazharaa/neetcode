export function validAnagram(s: string, t: string): boolean {
  if (s.length !== t.length) {
    return false;
  }

  const counts = new Array(26).fill(0);

  for (let i = 0; i < s.length; i++) {
    counts[s[i].charCodeAt(0) - "a".charCodeAt(0)]++;
    counts[t[i].charCodeAt(0) - "a".charCodeAt(0)]--;
  }

  for (const v of counts) {
    if (v !== 0) {
      return false;
    }
  }

  return true;
}
