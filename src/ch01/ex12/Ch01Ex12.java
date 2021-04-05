package ch01.ex12;

public class Ch01Ex12 {

/*
Taken from java.base/com/sun/java/util/jar/pack/PackageReader.java

	private void readByteCodeOps() throws IOException {
		// scratch buffer for collecting code::
		byte[] buf = new byte[1<<12];
		// record of all switch opcodes (these are variable-length)
		List<Integer> allSwitchOps = new ArrayList<>();
		for (int k = 0; k < allCodes.length; k++) {
			Code c = allCodes[k];
			//scanOneMethod:  <---------------------------------------------------------------
			boolean scanOneMethod = false;
			for (int i = 0; ; i++) {
				int bc = bc_codes.getByte();
				if (i + 10 > buf.length)  buf = realloc(buf);
				buf[i] = (byte)bc;
				boolean isWide = false;
				if (bc == _wide) {
					bc = bc_codes.getByte();
					buf[++i] = (byte)bc;
					isWide = true;
				}
				assert(bc == (0xFF & bc));
				// Adjust expectations of various band sizes.
				switch (bc) {
					case _tableswitch:
					case _lookupswitch:
						bc_case_count.expectMoreLength(1);
						allSwitchOps.add(bc);
						break;
					case _iinc:
						bc_local.expectMoreLength(1);
						if (isWide)
							bc_short.expectMoreLength(1);
						else
							bc_byte.expectMoreLength(1);
						break;
					case _sipush:
						bc_short.expectMoreLength(1);
						break;
					case _bipush:
						bc_byte.expectMoreLength(1);
						break;
					case _newarray:
						bc_byte.expectMoreLength(1);
						break;
					case _multianewarray:
						assert(getCPRefOpBand(bc) == bc_classref);
						bc_classref.expectMoreLength(1);
						bc_byte.expectMoreLength(1);
						break;
					case _ref_escape:
						bc_escrefsize.expectMoreLength(1);
						bc_escref.expectMoreLength(1);
						break;
					case _byte_escape:
						bc_escsize.expectMoreLength(1);
						// bc_escbyte will have to be counted too
						break;
					default:
						if (Instruction.isInvokeInitOp(bc)) {
							bc_initref.expectMoreLength(1);
							break;
						}
						if (Instruction.isSelfLinkerOp(bc)) {
							CPRefBand bc_which = selfOpRefBand(bc);
							bc_which.expectMoreLength(1);
							break;
						}
						if (Instruction.isBranchOp(bc)) {
							bc_label.expectMoreLength(1);
							break;
						}
						if (Instruction.isCPRefOp(bc)) {
							CPRefBand bc_which = getCPRefOpBand(bc);
							bc_which.expectMoreLength(1);
							assert(bc != _multianewarray);  // handled elsewhere
							break;
						}
						if (Instruction.isLocalSlotOp(bc)) {
							bc_local.expectMoreLength(1);
							break;
						}
						break;
					case _end_marker:
					{
						// Transfer from buf to a more permanent place:
						c.bytes = realloc(buf, i);
						//break scanOneMethod; <---------------------------------------------------
						scanOneMethod = true;
						break;
					}
				}
				// NEW LINES HERE <----------------------------------------------------------------
				if (scanOneMethod) {
					break;
				}
			}
		}

		// To size instruction bands correctly, we need info on switches:
		bc_case_count.readFrom(in);
		for (Integer i : allSwitchOps) {
			int bc = i.intValue();
			int caseCount = bc_case_count.getInt();
			bc_label.expectMoreLength(1+caseCount); // default label + cases
			bc_case_value.expectMoreLength(bc == _tableswitch ? 1 : caseCount);
		}
		bc_case_count.resetForSecondPass();
	}
*/

	public static void main(String[] args) {
		System.out.println("CH01Ex12 Nothing to run");
	}
}
